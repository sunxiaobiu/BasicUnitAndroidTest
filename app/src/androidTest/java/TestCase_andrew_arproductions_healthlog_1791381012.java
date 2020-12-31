import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_andrew_arproductions_healthlog_1791381012 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Preference.class);
      Object var1 = EasyMock.createMock(OnPreferenceChangeListener.class);
      ((Preference)var2).setOnPreferenceChangeListener((OnPreferenceChangeListener)var1);
   }
}
