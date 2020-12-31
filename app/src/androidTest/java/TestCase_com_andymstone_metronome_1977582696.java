import android.preference.CheckBoxPreference;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_andymstone_metronome_1977582696 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(CheckBoxPreference.class);
      String var1 = "android";
      ((CheckBoxPreference)var2).setSummaryOff(var1);
   }
}
