package test;

import junit.framework.AssertionFailedError;

class AssertionProblem {


    public void Foo() {
        try {
            // noop
        } catch (AssertionFailedError e) {
            // noop
        }
    }

    public void Foo() {
        try {
            // noop
        } catch (junit.framework.AssertionFailedError e) {
            // noop
        }
    }
}
