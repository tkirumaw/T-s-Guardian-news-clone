package org.asghari.guardiannews.presentation.viewmodels;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001a\u001a\u00020\u001dH\u0002J\u0016\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0012R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R&\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018\u00a8\u0006\""}, d2 = {"Lorg/asghari/guardiannews/presentation/viewmodels/SectionsViewModel;", "Landroidx/lifecycle/ViewModel;", "getAllSectionsUseCase", "Lorg/asghari/guardiannews/domain/usecases/GetAllSectionsUseCase;", "getSectionByIdUseCase", "Lorg/asghari/guardiannews/domain/usecases/GetSectionByIdUseCase;", "getSelectedSectionsUseCase", "Lorg/asghari/guardiannews/domain/usecases/GetSelectedSectionsUseCase;", "saveSelectedSectionUsecase", "Lorg/asghari/guardiannews/domain/usecases/SaveSelectedSectionsUseCase;", "deleteSectionByIdUsecase", "Lorg/asghari/guardiannews/domain/usecases/DeleteSectionByIdUsecase;", "(Lorg/asghari/guardiannews/domain/usecases/GetAllSectionsUseCase;Lorg/asghari/guardiannews/domain/usecases/GetSectionByIdUseCase;Lorg/asghari/guardiannews/domain/usecases/GetSelectedSectionsUseCase;Lorg/asghari/guardiannews/domain/usecases/SaveSelectedSectionsUseCase;Lorg/asghari/guardiannews/domain/usecases/DeleteSectionByIdUsecase;)V", "_SectionsList", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lorg/asghari/guardiannews/other/SectionsState;", "_SelectedSections", "", "", "sectionList", "Landroidx/compose/runtime/MutableState;", "getSectionList", "()Landroidx/compose/runtime/MutableState;", "setSectionList", "(Landroidx/compose/runtime/MutableState;)V", "selectedSectionsList", "getSelectedSectionsList", "setSelectedSectionsList", "getSectionsList", "", "toggleSelectedSection", "isChecked", "", "sectionId", "app_debug"})
public final class SectionsViewModel extends androidx.lifecycle.ViewModel {
    private final org.asghari.guardiannews.domain.usecases.GetAllSectionsUseCase getAllSectionsUseCase = null;
    private final org.asghari.guardiannews.domain.usecases.GetSectionByIdUseCase getSectionByIdUseCase = null;
    private final org.asghari.guardiannews.domain.usecases.GetSelectedSectionsUseCase getSelectedSectionsUseCase = null;
    private final org.asghari.guardiannews.domain.usecases.SaveSelectedSectionsUseCase saveSelectedSectionUsecase = null;
    private final org.asghari.guardiannews.domain.usecases.DeleteSectionByIdUsecase deleteSectionByIdUsecase = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<org.asghari.guardiannews.other.SectionsState> _SectionsList = null;
    @org.jetbrains.annotations.NotNull
    private androidx.compose.runtime.MutableState<org.asghari.guardiannews.other.SectionsState> sectionList;
    private final kotlinx.coroutines.flow.MutableSharedFlow<java.util.List<java.lang.String>> _SelectedSections = null;
    @org.jetbrains.annotations.NotNull
    private androidx.compose.runtime.MutableState<java.util.List<java.lang.String>> selectedSectionsList;
    
    @javax.inject.Inject
    public SectionsViewModel(@org.jetbrains.annotations.NotNull
    org.asghari.guardiannews.domain.usecases.GetAllSectionsUseCase getAllSectionsUseCase, @org.jetbrains.annotations.NotNull
    org.asghari.guardiannews.domain.usecases.GetSectionByIdUseCase getSectionByIdUseCase, @org.jetbrains.annotations.NotNull
    org.asghari.guardiannews.domain.usecases.GetSelectedSectionsUseCase getSelectedSectionsUseCase, @org.jetbrains.annotations.NotNull
    org.asghari.guardiannews.domain.usecases.SaveSelectedSectionsUseCase saveSelectedSectionUsecase, @org.jetbrains.annotations.NotNull
    org.asghari.guardiannews.domain.usecases.DeleteSectionByIdUsecase deleteSectionByIdUsecase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<org.asghari.guardiannews.other.SectionsState> getSectionList() {
        return null;
    }
    
    public final void setSectionList(@org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<org.asghari.guardiannews.other.SectionsState> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.util.List<java.lang.String>> getSelectedSectionsList() {
        return null;
    }
    
    public final void setSelectedSectionsList(@org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<java.util.List<java.lang.String>> p0) {
    }
    
    public final void toggleSelectedSection(boolean isChecked, @org.jetbrains.annotations.NotNull
    java.lang.String sectionId) {
    }
    
    private final void getSectionsList() {
    }
    
    private final void getSelectedSectionsList() {
    }
}