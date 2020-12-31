import android.preference.PreferenceActivity;
import android.preference.PreferenceActivity.Header;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ccc71_bmw_141844369 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(PreferenceActivity.class);
      Object var1 = EasyMock.createMock(Header.class);
      ((PreferenceActivity)var2).switchToHeader((Header)var1);
   }
}
