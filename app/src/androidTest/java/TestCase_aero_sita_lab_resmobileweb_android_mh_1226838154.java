import android.text.SpannableStringBuilder;
import android.text.Spanned;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aero_sita_lab_resmobileweb_android_mh_1226838154 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Spanned.class);
      SpannableStringBuilder var6 = new SpannableStringBuilder((CharSequence)var1);
      byte var7 = 1;
      byte var2 = 1;
      Object var3 = EasyMock.createMock(SpannableStringBuilder.class);
      byte var4 = 1;
      byte var5 = 1;
      var6.replace(var7, var2, (CharSequence)var3, var4, var5);
   }
}
