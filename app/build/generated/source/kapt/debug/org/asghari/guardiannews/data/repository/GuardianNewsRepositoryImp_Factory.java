// Generated by Dagger (https://dagger.dev).
package org.asghari.guardiannews.data.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import org.asghari.guardiannews.data.remote.RemoteDataSource;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GuardianNewsRepositoryImp_Factory implements Factory<GuardianNewsRepositoryImp> {
  private final Provider<RemoteDataSource> remoteDataSourceProvider;

  public GuardianNewsRepositoryImp_Factory(Provider<RemoteDataSource> remoteDataSourceProvider) {
    this.remoteDataSourceProvider = remoteDataSourceProvider;
  }

  @Override
  public GuardianNewsRepositoryImp get() {
    return newInstance(remoteDataSourceProvider.get());
  }

  public static GuardianNewsRepositoryImp_Factory create(
      Provider<RemoteDataSource> remoteDataSourceProvider) {
    return new GuardianNewsRepositoryImp_Factory(remoteDataSourceProvider);
  }

  public static GuardianNewsRepositoryImp newInstance(RemoteDataSource remoteDataSource) {
    return new GuardianNewsRepositoryImp(remoteDataSource);
  }
}
