package net.wrightnz.mockie;

import org.mockito.ArgumentMatcher;
import org.mockito.Mockito;

public final class AnyClass {

    private AnyClass(){ }

    /**
     * Match any class reference argument.
     *
     * @param <T>
     * @return true for an Class reference.
     */
    public static <T> Class<T> anyClass() {
        return Mockito.argThat(new AnyClassMatcher<>());
    }

}

class AnyClassMatcher<T> implements ArgumentMatcher<Class<T>> {

    @Override
    public boolean matches(final Class<T> aClass) {
        return true;
    }

}
