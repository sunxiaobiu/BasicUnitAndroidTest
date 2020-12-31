import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.support.v4.content.res.ResourcesCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_vodafone_dreamlabapp__1534707370 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Resources.class);
      Object var1 = EasyMock.createMock(Theme.class);
      ResourcesCompat.getColor((Resources)var0, 2131689479, (Theme)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
