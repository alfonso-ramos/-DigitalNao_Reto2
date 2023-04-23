public class Main {

    public static void main(String[] args) throws Exception {
        GoogleScholarAuthorModel model = new GoogleScholarAuthorModel();
        GoogleScholarAuthorView view = new GoogleScholarAuthorView();
        GoogleScholarAuthorController controller = new GoogleScholarAuthorController(model, view);
        controller.fetchCitations();
    }
}
