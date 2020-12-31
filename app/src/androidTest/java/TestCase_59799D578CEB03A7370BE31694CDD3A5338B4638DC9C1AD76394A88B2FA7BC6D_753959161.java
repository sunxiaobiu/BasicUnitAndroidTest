import android.preference.Preference;
import android.preference.PreferenceGroup;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59799D578CEB03A7370BE31694CDD3A5338B4638DC9C1AD76394A88B2FA7BC6D_753959161 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(PreferenceGroup.class);
      Object var1 = EasyMock.createMock(Preference.class);
      ((PreferenceGroup)var2).addPreference((Preference)var1);
   }
}
