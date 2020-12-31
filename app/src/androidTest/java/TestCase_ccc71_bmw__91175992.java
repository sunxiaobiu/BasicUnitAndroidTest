import android.app.Fragment;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ccc71_bmw__91175992 {
   @Test
   public void testCase() throws Exception {
      Object var5 = EasyMock.createMock(PreferenceActivity.class);
      String var1 = "android";
      Object var2 = EasyMock.createMock(Bundle.class);
      byte var3 = 1;
      Object var4 = null;
      ((PreferenceActivity)var5).startPreferencePanel(var1, (Bundle)var2, var3, (CharSequence)var4, (Fragment)null, 0);
   }
}
