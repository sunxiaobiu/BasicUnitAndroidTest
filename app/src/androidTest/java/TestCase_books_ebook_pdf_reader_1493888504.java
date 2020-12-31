import android.preference.Preference;
import android.preference.PreferenceGroup;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_books_ebook_pdf_reader_1493888504 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Preference.class);
      PreferenceGroup var3 = (PreferenceGroup)var2;
      byte var1 = 1;
      var3.getPreference(var1);
   }
}
