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
public final class DeleteSectionByIdUsecase_Factory implements Factory<DeleteSectionByIdUsecase> {
  private final Provider<SettingsRepository> settingsRepositoryProvider;

  public DeleteSectionByIdUsecase_Factory(Provider<SettingsRepository> settingsRepositoryProvider) {
    this.settingsRepositoryProvider = settingsRepositoryProvider;
  }

  @Override
  public DeleteSectionByIdUsecase get() {
    return newInstance(settingsRepositoryProvider.get());
  }

  public static DeleteSectionByIdUsecase_Factory create(
      Provider<SettingsRepository> settingsRepositoryProvider) {
    return new DeleteSectionByIdUsecase_Factory(settingsRepositoryProvider);
  }

  public static DeleteSectionByIdUsecase newInstance(SettingsRepository settingsRepository) {
    return new DeleteSectionByIdUsecase(settingsRepository);
  }
}