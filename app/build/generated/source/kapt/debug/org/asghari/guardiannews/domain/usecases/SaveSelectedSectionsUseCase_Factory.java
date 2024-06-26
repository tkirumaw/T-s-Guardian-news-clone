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
public final class SaveSelectedSectionsUseCase_Factory implements Factory<SaveSelectedSectionsUseCase> {
  private final Provider<SettingsRepository> settingsRepositoryProvider;

  public SaveSelectedSectionsUseCase_Factory(
      Provider<SettingsRepository> settingsRepositoryProvider) {
    this.settingsRepositoryProvider = settingsRepositoryProvider;
  }

  @Override
  public SaveSelectedSectionsUseCase get() {
    return newInstance(settingsRepositoryProvider.get());
  }

  public static SaveSelectedSectionsUseCase_Factory create(
      Provider<SettingsRepository> settingsRepositoryProvider) {
    return new SaveSelectedSectionsUseCase_Factory(settingsRepositoryProvider);
  }

  public static SaveSelectedSectionsUseCase newInstance(SettingsRepository settingsRepository) {
    return new SaveSelectedSectionsUseCase(settingsRepository);
  }
}
