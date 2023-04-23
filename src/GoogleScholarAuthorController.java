public class GoogleScholarAuthorController {

    private GoogleScholarAuthorModel model;
    private GoogleScholarAuthorView view;

    public GoogleScholarAuthorController(GoogleScholarAuthorModel model, GoogleScholarAuthorView view) {
        this.model = model;
        this.view = view;
    }

    public void fetchCitations() throws Exception {
        String[] authorDetails = view.getAuthorDetails();
        String authorId = authorDetails[0];
        String apiKey = authorDetails[1];
        String numResults = authorDetails[2];

        String citations = model.getCitations(authorId, apiKey, numResults);
        view.printCitations(citations);
    }
}