import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.support.v4.app.NavUtils;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_appfreeislamic_AbdulbasitwithEnglishMp3_1110797872 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Activity.class);
      Object var1 = EasyMock.createMock(ComponentName.class);
      NavUtils.getParentActivityName((Context)var0, (ComponentName)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
