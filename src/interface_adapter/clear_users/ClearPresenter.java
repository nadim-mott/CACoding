package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewManagerModel;
import use_case.clear_users.ClearOutputBoundary;

import java.util.Set;

public class ClearPresenter implements ClearOutputBoundary {
    private ClearViewModel viewModel;
    private ViewManagerModel viewManagerModel;

    public ClearPresenter(ClearViewModel viewModel, ViewManagerModel viewManagerModel) {
        this.viewModel = viewModel;
        this.viewManagerModel = viewManagerModel;
    }

    public void clear_view(Set<String> users) {
        viewModel.setUsers(users);
    }
}
