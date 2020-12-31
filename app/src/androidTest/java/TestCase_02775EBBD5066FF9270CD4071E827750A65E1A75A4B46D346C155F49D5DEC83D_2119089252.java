import android.content.Context;
import android.preference.PreferenceManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_02775EBBD5066FF9270CD4071E827750A65E1A75A4B46D346C155F49D5DEC83D_2119089252 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      PreferenceManager.setDefaultValues((Context)var0, 2130968579, true);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
