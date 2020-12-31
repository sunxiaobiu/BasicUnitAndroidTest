import android.content.Context;
import android.media.AudioManager;
import android.view.KeyEvent;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5ACC7934C85E60CF203196A04D0E1419D9BCC88C9732B56E84BA6A95EF05DE46_1553703140 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var3 = var2.getSystemService("audio");
      AudioManager var4 = (AudioManager)var3;
      Object var1 = EasyMock.createMock(KeyEvent.class);
      var4.dispatchMediaKeyEvent((KeyEvent)var1);
   }
}
