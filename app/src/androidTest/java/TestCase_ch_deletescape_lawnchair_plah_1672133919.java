import android.content.ComponentName;
import android.content.pm.ShortcutInfo;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_deletescape_lawnchair_plah_1672133919 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(ShortcutInfo.class);
      ComponentName var2 = ((ShortcutInfo)var1).getActivity();
   }
}
