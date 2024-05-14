// Generated by Dagger (https://dagger.dev).
package org.asghari.guardiannews.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import org.asghari.guardiannews.domain.exceptions.IErrorHandler;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DataModule_ProvideErrorHandlerFactory implements Factory<IErrorHandler> {
  private final DataModule module;

  public DataModule_ProvideErrorHandlerFactory(DataModule module) {
    this.module = module;
  }

  @Override
  public IErrorHandler get() {
    return provideErrorHandler(module);
  }

  public static DataModule_ProvideErrorHandlerFactory create(DataModule module) {
    return new DataModule_ProvideErrorHandlerFactory(module);
  }

  public static IErrorHandler provideErrorHandler(DataModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideErrorHandler());
  }
}
