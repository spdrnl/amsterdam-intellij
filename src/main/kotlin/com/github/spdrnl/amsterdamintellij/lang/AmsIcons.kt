package com.github.spdrnl.amsterdamintellij.lang

import com.intellij.openapi.util.IconLoader
import javax.swing.Icon

object AmsIcons {
    @JvmField
    val PREFIX = IconLoader.getIcon("/icons/prefix.svg", javaClass)
    @JvmField
    val ANNOTATION_PROPERTY = IconLoader.getIcon("/icons/annotation_property.svg", javaClass)
    @JvmField
    val CLASS = IconLoader.getIcon("/icons/class.svg", javaClass)
    @JvmField
    val OBJECT_PROPERTY = IconLoader.getIcon("/icons/object_property.svg", javaClass)
    @JvmField
    val DATA_PROPERTY = IconLoader.getIcon("/icons/data_property.svg", javaClass)
    @JvmField
    val ALL_DISJOINT_CLASSES = IconLoader.getIcon("/icons/all_disjoint_classes.svg", javaClass)
}
