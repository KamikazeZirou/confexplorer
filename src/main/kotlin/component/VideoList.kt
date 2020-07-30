package component

import kotlinx.html.js.onClickFunction
import model.Video
import react.*
import react.dom.p

external interface VideoListProps: RProps {
    var videos: List<Video>
    var selectedVideo: Video?
    var onSelectVideo: (Video) -> Unit
}

class VideoList: RComponent<VideoListProps, RState>() {
    override fun RBuilder.render() {
        props.videos.forEach { video ->
            p {
                key = video.id.toString()
                attrs {
                    onClickFunction = {
                        props.onSelectVideo(video)
                    }
                }
                if (video == props.selectedVideo) {
                    +"▶ "
                }
                +"${video.speaker}: ${video.title}"
            }
        }
    }
}

fun RBuilder.videoList(handler: VideoListProps.() -> Unit): ReactElement {
    return child(VideoList::class) {
        this.attrs(handler)
    }
}

val videoListFC = functionalComponent<VideoListProps> { props ->
    props.videos.forEach { video ->
        p {
            key = video.id.toString()
            attrs {
                onClickFunction = {
                    props.onSelectVideo(video)
                }
            }
            if (video == props.selectedVideo) {
                +"▶ "
            }
            +"${video.speaker}: ${video.title}"
        }
    }
}

fun RBuilder.videoListFC(handler: VideoListProps.() -> Unit): ReactElement {
    return child(videoListFC) {
        attrs {
            handler()
        }
    }
}