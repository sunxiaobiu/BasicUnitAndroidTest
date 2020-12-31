import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_595A379329900BEA03111C2A9CDAF3A886A37FDAA8B15F54AD7804F327D9A84F_522618305 {
   @Test
   public void testCase() throws Exception {
      Context var4 = InstrumentationRegistry.getTargetContext();
      Object var5 = var4.getSystemService("alarm");
      AlarmManager var6 = (AlarmManager)var5;
      long var1 = 1L;
      Object var3 = EasyMock.createMock(PendingIntent.class);
      var6.setExactAndAllowWhileIdle(0, var1, (PendingIntent)var3);
   }
}
