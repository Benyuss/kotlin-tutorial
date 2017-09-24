package delegatedproperties

/**
 * You can declare local variables as delegated properties. For instance, you can make a local variable lazy:
 *
 * The memoizedFoo variable will be computed on the first access only.
 * If someCondition fails, the variable won't be computed at all.
 *
 * NOTE: commented because of compiler error.
 */
//fun example(computeFoo: () -> Foo) {
//    val memoizedFoo by lazy(computeFoo)
//
//    if (someCondition && memoizedFoo.isValid()) {
//        memoizedFoo.doSomething()
//    }
//}