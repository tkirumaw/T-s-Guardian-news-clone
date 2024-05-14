// Generated by Dagger (https://dagger.dev).
package org.asghari.guardiannews.di;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import org.asghari.guardiannews.data.local.LocalDataSource;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DataModule_ProvideLocalDataSourceFactory implements Factory<LocalDataSource> {
  private final DataModule module;

  private final Provider<Context> contextProvider;

  public DataModule_ProvideLocalDataSourceFactory(DataModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public LocalDataSource get() {
    return provideLocalDataSource(module, contextProvider.get());
  }

  public static DataModule_ProvideLocalDataSourceFactory create(DataModule module,
      Provider<Context> contextProvider) {
    return new DataModule_ProvideLocalDataSourceFactory(module, contextProvider);
  }

  public static LocalDataSource provideLocalDataSource(DataModule instance, Context context) {
    return Preconditions.checkNotNullFromProvides(instance.provideLocalDataSource(context));
  }
}
