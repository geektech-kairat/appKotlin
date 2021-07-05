package com.example.appkotlin.core

import org.junit.Test

class AbstractTest {
    @Test
    fun text_success() {

    }

    private sealed class TextDataObject : Abstract.Object<DomainObject, DomainToDataMapper>() {
        abstract override fun map(mapper: DomainToDataMapper): DomainObject

    }

    private interface DomainToDataMapper : Abstract.Mapper {

    }

    private sealed class DomainObject
}