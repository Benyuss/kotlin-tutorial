package delegatedproperties

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

/**
 * By defining the [provideDelegate] operator you can extend the logic of creating the object to which the property
 * implementation is delegated. If the object used on the right hand side of by defines provideDelegate as a member or
 * extension function, that function will be called to create the property delegate instance.
 *
 * @see "https://kotlinlang.org/docs/reference/delegated-properties.html#providing-a-delegate-since-11"
 */
fun main(args: Array<String>) {

}

//class ResourceLoader<T>(id: ResourceID<T>) {
//    operator fun provideDelegate(thisRef: MyUI, prop: KProperty<*>): ReadOnlyProperty<MyUI, T> {
//        checkProperty(thisRef, prop.name)
//        // create delegate
//    }
//
//    private fun checkProperty(thisRef: MyUI, name: String) {
//        ...
//    }
//}
//
//fun <T> bindResource(id: ResourceID<T>): ResourceLoader<T> {
//    ...
//}
//
//class MyUI {
//    val image by bindResource(ResourceID.image_id)
//    val text by bindResource(ResourceID.text_id)
//}