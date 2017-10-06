package net.wrightnz.mockie;

import org.mockito.ArgumentMatcher;
import org.mockito.Mockito;

public class AnyClass {

  /**
   * Match any class reference argument.
   * @return true fot an Class reference.
   */
  public static Class<?> anyClass() {
    return Mockito.argThat(new AnyClassMatcher());
  }

}

class AnyClassMatcher implements ArgumentMatcher<Class<?>> {

  public boolean matches(final Class<?> aClass) {
    return true;
  }

}
