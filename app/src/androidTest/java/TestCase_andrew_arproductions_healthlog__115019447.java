import android.preference.ListPreference;
import android.preference.Preference;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_andrew_arproductions_healthlog__115019447 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Preference.class);
      ListPreference var2 = (ListPreference)var1;
      CharSequence[] var3 = var2.getEntries();
   }
}
