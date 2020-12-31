import android.preference.ListPreference;
import android.preference.Preference;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_andrew_arproductions_healthlog__1219910544 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Preference.class);
      ListPreference var3 = (ListPreference)var2;
      String var1 = "android";
      var3.findIndexOfValue(var1);
   }
}
