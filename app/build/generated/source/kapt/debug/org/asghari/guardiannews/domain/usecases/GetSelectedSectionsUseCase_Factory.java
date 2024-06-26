// Generated by Dagger (https://dagger.dev).
package org.asghari.guardiannews.domain.usecases;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import org.asghari.guardiannews.domain.repositories.SettingsRepository;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GetSelectedSectionsUseCase_Factory implements Factory<GetSelectedSectionsUseCase> {
  private final Provider<SettingsRepository> settingsRepositoryProvider;

  public GetSelectedSectionsUseCase_Factory(
      Provider<SettingsRepository> settingsRepositoryProvider) {
    this.settingsRepositoryProvider = settingsRepositoryProvider;
  }

  @Override
  public GetSelectedSectionsUseCase get() {
    return newInstance(settingsRepositoryProvider.get());
  }

  public static GetSelectedSectionsUseCase_Factory create(
      Provider<SettingsRepository> settingsRepositoryProvider) {
    return new GetSelectedSectionsUseCase_Factory(settingsRepositoryProvider);
  }

  public static GetSelectedSectionsUseCase newInstance(SettingsRepository settingsRepository) {
    return new GetSelectedSectionsUseCase(settingsRepository);
  }
}
