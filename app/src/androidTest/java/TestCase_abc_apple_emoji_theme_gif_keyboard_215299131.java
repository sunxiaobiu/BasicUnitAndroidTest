import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abc_apple_emoji_theme_gif_keyboard_215299131 {
   @Test
   public void testCase() throws Exception {
      Context var4 = InstrumentationRegistry.getTargetContext();
      Object var5 = var4.getSystemService("alarm");
      AlarmManager var6 = (AlarmManager)var5;
      long var1 = 1L;
      Object var3 = EasyMock.createMock(PendingIntent.class);
      var6.setInexactRepeating(1, var1, 1800000L, (PendingIntent)var3);
   }
}
