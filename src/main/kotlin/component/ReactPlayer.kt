@file:JsModule("react-player")
@file:JsNonModule

package component

import react.*

@JsName("default")
external val reactPlayer: RClass<ReactPlayerProps>

external interface ReactPlayerProps : RProps {
    var url: String
}