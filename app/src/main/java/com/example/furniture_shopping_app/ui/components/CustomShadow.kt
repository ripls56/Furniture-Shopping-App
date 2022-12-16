//package com.example.furniture_shopping_app.ui.components
//
//import androidx.compose.ui.Modifier
//
//class CustomShadow {
//
//    fun Modifier.roundRectShadow(
//        customShadowParams: CustomShadowParams,
//        cornerRadius: Dp
//    ) = this.then(ShadowDrawer(customShadowParams, cornerRadius))
//
//    private class ShadowDrawer(
//        private val customShadowParams: CustomShadowParams,
//        private val cornerRadius: Dp
//    ) : DrawModifier {
//
//        private val composeCompatShadowsRenderer = ComposeCompatShadowsRenderer()
//
//        override fun ContentDrawScope.draw() {
//            customShadowParams.layers.forEach {
//                composeCompatShadowsRenderer.paintCompatShadow(
//                    canvas = this,
//                    outlineCornerRadius = cornerRadius.toPx(),
//                    shadow = it
//                )
//            }
//            drawContent()
//        }
//    }
//}