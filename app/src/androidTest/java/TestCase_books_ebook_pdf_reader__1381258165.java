import android.app.Activity;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_books_ebook_pdf_reader__1381258165 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = new ActivityTestRule(Activity.class);
      Activity var2 = var1.getActivity();
      var2.setProgressBarIndeterminate(true);
   }
}
