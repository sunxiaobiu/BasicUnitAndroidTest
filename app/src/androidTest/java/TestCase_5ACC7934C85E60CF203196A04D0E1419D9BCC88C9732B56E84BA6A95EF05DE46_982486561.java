import android.app.PendingIntent;
import android.app.PendingIntent.OnFinished;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5ACC7934C85E60CF203196A04D0E1419D9BCC88C9732B56E84BA6A95EF05DE46_982486561 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(PendingIntent.class);
      Object var1 = EasyMock.createMock(Context.class);
      Object var2 = EasyMock.createMock(Bundle.class);
      ((PendingIntent)var3).send((Context)var1, 11, (Intent)null, (OnFinished)null, (Handler)null, (String)null, (Bundle)var2);
   }
}
