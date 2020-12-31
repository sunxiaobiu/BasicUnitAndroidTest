import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.RemoteControlClient;
import android.media.RemoteControlClient.MetadataEditor;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_asustor_aimusics_1260335629 {
   @Test
   public void testCase() throws Exception {
      Intent var2 = new Intent("android.intent.action.MEDIA_BUTTON");
      Context var1 = InstrumentationRegistry.getTargetContext();
      PendingIntent var3 = PendingIntent.getBroadcast(var1, 0, var2, 0);
      RemoteControlClient var5 = new RemoteControlClient(var3);
      MetadataEditor var4 = var5.editMetadata(true);
      Object var6 = EasyMock.createMock(Bitmap.class);
      var4.putBitmap(100, (Bitmap)var6);
   }
}
