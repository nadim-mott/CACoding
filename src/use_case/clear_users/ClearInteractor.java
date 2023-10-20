package use_case.clear_users;

// TODO Complete me

public class ClearInteractor implements ClearInputBoundary{

    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessObject, ClearOutputBoundary clearOutputBoundary) {
        this.userDataAccessObject = userDataAccessObject;
        this.clearPresenter = clearOutputBoundary;
    }

    @Override
    public void execute() {
        clearPresenter.clear_view(userDataAccessObject.clear_users());

    }
}
