package com.example.testjacocobug

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TestActivityScenario {

    @Test
    fun testStringAdapter() {
        ActivityScenario.launch(
            TestActivity::class.java
        ).onActivity { activity ->

        }
    }

}