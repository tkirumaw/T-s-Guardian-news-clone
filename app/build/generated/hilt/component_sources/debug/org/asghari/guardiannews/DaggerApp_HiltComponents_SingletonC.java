// Generated by Dagger (https://dagger.dev).
package org.asghari.guardiannews;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_Lifecycle_Factory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import dagger.internal.SetBuilder;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import org.asghari.guardiannews.data.local.LocalDataSource;
import org.asghari.guardiannews.data.remote.RemoteDataSource;
import org.asghari.guardiannews.data.remote.apiservices.GuardianNewsApiService;
import org.asghari.guardiannews.data.remote.apiservices.SectionsApiService;
import org.asghari.guardiannews.di.DataModule;
import org.asghari.guardiannews.di.DataModule_PrivideSectionsRepositoryFactory;
import org.asghari.guardiannews.di.DataModule_ProvideErrorHandlerFactory;
import org.asghari.guardiannews.di.DataModule_ProvideLocalDataSourceFactory;
import org.asghari.guardiannews.di.DataModule_ProvideNewsRepositoryFactory;
import org.asghari.guardiannews.di.DataModule_ProvideRemoteDataSourceFactory;
import org.asghari.guardiannews.di.DataModule_ProvideSettingsRepositoryFactory;
import org.asghari.guardiannews.di.NetworkModule;
import org.asghari.guardiannews.di.NetworkModule_ProvidesRetrofitNewsApiFactory;
import org.asghari.guardiannews.di.NetworkModule_ProvidesRetrofitSectionApiFactory;
import org.asghari.guardiannews.domain.exceptions.IErrorHandler;
import org.asghari.guardiannews.domain.repositories.GuardianNewsRepository;
import org.asghari.guardiannews.domain.repositories.SectionsRepository;
import org.asghari.guardiannews.domain.repositories.SettingsRepository;
import org.asghari.guardiannews.domain.usecases.DeleteSectionByIdUsecase;
import org.asghari.guardiannews.domain.usecases.GetAllSectionsUseCase;
import org.asghari.guardiannews.domain.usecases.GetSectionByIdUseCase;
import org.asghari.guardiannews.domain.usecases.GetSelectedSectionsUseCase;
import org.asghari.guardiannews.domain.usecases.LastNewsListUseCase;
import org.asghari.guardiannews.domain.usecases.NewsDetailsUseCase;
import org.asghari.guardiannews.domain.usecases.SaveSelectedSectionsUseCase;
import org.asghari.guardiannews.domain.usecases.SearchInNewsListUseCase;
import org.asghari.guardiannews.presentation.activities.MainActivity;
import org.asghari.guardiannews.presentation.adapters.NewsListAdapter;
import org.asghari.guardiannews.presentation.fragments.HomePageFragment;
import org.asghari.guardiannews.presentation.fragments.HomePageFragment_MembersInjector;
import org.asghari.guardiannews.presentation.fragments.NewsDetailesPageFragment;
import org.asghari.guardiannews.presentation.viewmodels.NewsDetailsViewModel;
import org.asghari.guardiannews.presentation.viewmodels.NewsDetailsViewModel_HiltModules_KeyModule_ProvideFactory;
import org.asghari.guardiannews.presentation.viewmodels.NewsListViewModel;
import org.asghari.guardiannews.presentation.viewmodels.NewsListViewModel_HiltModules_KeyModule_ProvideFactory;
import org.asghari.guardiannews.presentation.viewmodels.SectionsViewModel;
import org.asghari.guardiannews.presentation.viewmodels.SectionsViewModel_HiltModules_KeyModule_ProvideFactory;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerApp_HiltComponents_SingletonC {
  private DaggerApp_HiltComponents_SingletonC() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private DataModule dataModule;

    private NetworkModule networkModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public Builder dataModule(DataModule dataModule) {
      this.dataModule = Preconditions.checkNotNull(dataModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule(
        HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule) {
      Preconditions.checkNotNull(hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule);
      return this;
    }

    public Builder networkModule(NetworkModule networkModule) {
      this.networkModule = Preconditions.checkNotNull(networkModule);
      return this;
    }

    public App_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      if (dataModule == null) {
        this.dataModule = new DataModule();
      }
      if (networkModule == null) {
        this.networkModule = new NetworkModule();
      }
      return new SingletonCImpl(applicationContextModule, dataModule, networkModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements App_HiltComponents.ActivityRetainedC.Builder {
    private final SingletonCImpl singletonCImpl;

    private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public App_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl(singletonCImpl);
    }
  }

  private static final class ActivityCBuilder implements App_HiltComponents.ActivityC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public App_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonCImpl, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements App_HiltComponents.FragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public App_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements App_HiltComponents.ViewWithFragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public App_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements App_HiltComponents.ViewC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public App_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements App_HiltComponents.ViewModelC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public App_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      return new ViewModelCImpl(singletonCImpl, activityRetainedCImpl, savedStateHandle);
    }
  }

  private static final class ServiceCBuilder implements App_HiltComponents.ServiceC.Builder {
    private final SingletonCImpl singletonCImpl;

    private Service service;

    private ServiceCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public App_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonCImpl, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends App_HiltComponents.ViewWithFragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    private ViewWithFragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends App_HiltComponents.FragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    private FragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        Fragment fragmentParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }

    @Override
    public void injectHomePageFragment(HomePageFragment homePageFragment) {
      injectHomePageFragment2(homePageFragment);
    }

    @Override
    public void injectNewsDetailesPageFragment(NewsDetailesPageFragment newsDetailesPageFragment) {
    }

    private HomePageFragment injectHomePageFragment2(HomePageFragment instance) {
      HomePageFragment_MembersInjector.injectNewsListAdapter(instance, singletonCImpl.newsListAdapterProvider.get());
      return instance;
    }
  }

  private static final class ViewCImpl extends App_HiltComponents.ViewC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    private ViewCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends App_HiltComponents.ActivityC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    private ActivityCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonCImpl.applicationContextModule), getViewModelKeys(), new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl));
    }

    @Override
    public Set<String> getViewModelKeys() {
      return SetBuilder.<String>newSetBuilder(3).add(NewsDetailsViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(NewsListViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(SectionsViewModel_HiltModules_KeyModule_ProvideFactory.provide()).build();
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public void injectMainActivity(MainActivity mainActivity) {
    }
  }

  private static final class ViewModelCImpl extends App_HiltComponents.ViewModelC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    private Provider<NewsDetailsViewModel> newsDetailsViewModelProvider;

    private Provider<NewsListViewModel> newsListViewModelProvider;

    private Provider<SectionsViewModel> sectionsViewModelProvider;

    private ViewModelCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;

      initialize(savedStateHandleParam);

    }

    private NewsDetailsUseCase newsDetailsUseCase() {
      return new NewsDetailsUseCase(singletonCImpl.provideNewsRepositoryProvider.get(), singletonCImpl.provideErrorHandlerProvider.get());
    }

    private LastNewsListUseCase lastNewsListUseCase() {
      return new LastNewsListUseCase(singletonCImpl.provideNewsRepositoryProvider.get(), singletonCImpl.provideErrorHandlerProvider.get());
    }

    private SearchInNewsListUseCase searchInNewsListUseCase() {
      return new SearchInNewsListUseCase(singletonCImpl.provideNewsRepositoryProvider.get(), singletonCImpl.provideErrorHandlerProvider.get());
    }

    private GetSelectedSectionsUseCase getSelectedSectionsUseCase() {
      return new GetSelectedSectionsUseCase(singletonCImpl.provideSettingsRepositoryProvider.get());
    }

    private GetAllSectionsUseCase getAllSectionsUseCase() {
      return new GetAllSectionsUseCase(singletonCImpl.privideSectionsRepositoryProvider.get());
    }

    private GetSectionByIdUseCase getSectionByIdUseCase() {
      return new GetSectionByIdUseCase(singletonCImpl.privideSectionsRepositoryProvider.get());
    }

    private SaveSelectedSectionsUseCase saveSelectedSectionsUseCase() {
      return new SaveSelectedSectionsUseCase(singletonCImpl.provideSettingsRepositoryProvider.get());
    }

    private DeleteSectionByIdUsecase deleteSectionByIdUsecase() {
      return new DeleteSectionByIdUsecase(singletonCImpl.provideSettingsRepositoryProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam) {
      this.newsDetailsViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 0);
      this.newsListViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 1);
      this.sectionsViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 2);
    }

    @Override
    public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
      return MapBuilder.<String, Provider<ViewModel>>newMapBuilder(3).put("org.asghari.guardiannews.presentation.viewmodels.NewsDetailsViewModel", ((Provider) newsDetailsViewModelProvider)).put("org.asghari.guardiannews.presentation.viewmodels.NewsListViewModel", ((Provider) newsListViewModelProvider)).put("org.asghari.guardiannews.presentation.viewmodels.SectionsViewModel", ((Provider) sectionsViewModelProvider)).build();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          ViewModelCImpl viewModelCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // org.asghari.guardiannews.presentation.viewmodels.NewsDetailsViewModel 
          return (T) new NewsDetailsViewModel(viewModelCImpl.newsDetailsUseCase());

          case 1: // org.asghari.guardiannews.presentation.viewmodels.NewsListViewModel 
          return (T) new NewsListViewModel(viewModelCImpl.lastNewsListUseCase(), viewModelCImpl.searchInNewsListUseCase(), viewModelCImpl.getSelectedSectionsUseCase());

          case 2: // org.asghari.guardiannews.presentation.viewmodels.SectionsViewModel 
          return (T) new SectionsViewModel(viewModelCImpl.getAllSectionsUseCase(), viewModelCImpl.getSectionByIdUseCase(), viewModelCImpl.getSelectedSectionsUseCase(), viewModelCImpl.saveSelectedSectionsUseCase(), viewModelCImpl.deleteSectionByIdUsecase());

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends App_HiltComponents.ActivityRetainedC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    @SuppressWarnings("rawtypes")
    private Provider lifecycleProvider;

    private ActivityRetainedCImpl(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.lifecycleProvider = DoubleCheck.provider(new SwitchingProvider<Object>(singletonCImpl, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return (ActivityRetainedLifecycle) lifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.Lifecycle 
          return (T) ActivityRetainedComponentManager_Lifecycle_Factory.newInstance();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends App_HiltComponents.ServiceC {
    private final SingletonCImpl singletonCImpl;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(SingletonCImpl singletonCImpl, Service serviceParam) {
      this.singletonCImpl = singletonCImpl;


    }
  }

  private static final class SingletonCImpl extends App_HiltComponents.SingletonC {
    private final ApplicationContextModule applicationContextModule;

    private final DataModule dataModule;

    private final NetworkModule networkModule;

    private final SingletonCImpl singletonCImpl = this;

    private Provider<NewsListAdapter> newsListAdapterProvider;

    private Provider<GuardianNewsApiService> ProvidesRetrofitNewsApiProvider;

    private Provider<SectionsApiService> ProvidesRetrofitSectionApiProvider;

    private Provider<RemoteDataSource> provideRemoteDataSourceProvider;

    private Provider<GuardianNewsRepository> provideNewsRepositoryProvider;

    private Provider<IErrorHandler> provideErrorHandlerProvider;

    private Provider<LocalDataSource> provideLocalDataSourceProvider;

    private Provider<SettingsRepository> provideSettingsRepositoryProvider;

    private Provider<SectionsRepository> privideSectionsRepositoryProvider;

    private SingletonCImpl(ApplicationContextModule applicationContextModuleParam,
        DataModule dataModuleParam, NetworkModule networkModuleParam) {
      this.applicationContextModule = applicationContextModuleParam;
      this.dataModule = dataModuleParam;
      this.networkModule = networkModuleParam;
      initialize(applicationContextModuleParam, dataModuleParam, networkModuleParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final ApplicationContextModule applicationContextModuleParam,
        final DataModule dataModuleParam, final NetworkModule networkModuleParam) {
      this.newsListAdapterProvider = DoubleCheck.provider(new SwitchingProvider<NewsListAdapter>(singletonCImpl, 0));
      this.ProvidesRetrofitNewsApiProvider = DoubleCheck.provider(new SwitchingProvider<GuardianNewsApiService>(singletonCImpl, 3));
      this.ProvidesRetrofitSectionApiProvider = DoubleCheck.provider(new SwitchingProvider<SectionsApiService>(singletonCImpl, 4));
      this.provideRemoteDataSourceProvider = DoubleCheck.provider(new SwitchingProvider<RemoteDataSource>(singletonCImpl, 2));
      this.provideNewsRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<GuardianNewsRepository>(singletonCImpl, 1));
      this.provideErrorHandlerProvider = DoubleCheck.provider(new SwitchingProvider<IErrorHandler>(singletonCImpl, 5));
      this.provideLocalDataSourceProvider = DoubleCheck.provider(new SwitchingProvider<LocalDataSource>(singletonCImpl, 7));
      this.provideSettingsRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<SettingsRepository>(singletonCImpl, 6));
      this.privideSectionsRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<SectionsRepository>(singletonCImpl, 8));
    }

    @Override
    public Set<Boolean> getDisableFragmentGetContextFix() {
      return Collections.<Boolean>emptySet();
    }

    @Override
    public ActivityRetainedComponentBuilder retainedComponentBuilder() {
      return new ActivityRetainedCBuilder(singletonCImpl);
    }

    @Override
    public ServiceComponentBuilder serviceComponentBuilder() {
      return new ServiceCBuilder(singletonCImpl);
    }

    @Override
    public void injectApp(App app) {
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // org.asghari.guardiannews.presentation.adapters.NewsListAdapter 
          return (T) new NewsListAdapter();

          case 1: // org.asghari.guardiannews.domain.repositories.GuardianNewsRepository 
          return (T) DataModule_ProvideNewsRepositoryFactory.provideNewsRepository(singletonCImpl.dataModule, singletonCImpl.provideRemoteDataSourceProvider.get());

          case 2: // org.asghari.guardiannews.data.remote.RemoteDataSource 
          return (T) DataModule_ProvideRemoteDataSourceFactory.provideRemoteDataSource(singletonCImpl.dataModule, singletonCImpl.ProvidesRetrofitNewsApiProvider.get(), singletonCImpl.ProvidesRetrofitSectionApiProvider.get());

          case 3: // org.asghari.guardiannews.data.remote.apiservices.GuardianNewsApiService 
          return (T) NetworkModule_ProvidesRetrofitNewsApiFactory.ProvidesRetrofitNewsApi(singletonCImpl.networkModule);

          case 4: // org.asghari.guardiannews.data.remote.apiservices.SectionsApiService 
          return (T) NetworkModule_ProvidesRetrofitSectionApiFactory.ProvidesRetrofitSectionApi(singletonCImpl.networkModule);

          case 5: // org.asghari.guardiannews.domain.exceptions.IErrorHandler 
          return (T) DataModule_ProvideErrorHandlerFactory.provideErrorHandler(singletonCImpl.dataModule);

          case 6: // org.asghari.guardiannews.domain.repositories.SettingsRepository 
          return (T) DataModule_ProvideSettingsRepositoryFactory.provideSettingsRepository(singletonCImpl.dataModule, singletonCImpl.provideLocalDataSourceProvider.get());

          case 7: // org.asghari.guardiannews.data.local.LocalDataSource 
          return (T) DataModule_ProvideLocalDataSourceFactory.provideLocalDataSource(singletonCImpl.dataModule, ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          case 8: // org.asghari.guardiannews.domain.repositories.SectionsRepository 
          return (T) DataModule_PrivideSectionsRepositoryFactory.privideSectionsRepository(singletonCImpl.dataModule, singletonCImpl.provideRemoteDataSourceProvider.get());

          default: throw new AssertionError(id);
        }
      }
    }
  }
}
