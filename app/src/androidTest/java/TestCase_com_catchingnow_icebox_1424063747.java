import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.UserHandle;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_catchingnow_icebox_1424063747 {
   @Test
   public void testCase() throws Exception {
      Bundle var1 = new Bundle();
      Parcelable var2 = var1.getParcelable("authorize");
      PendingIntent var3 = (PendingIntent)var2;
      UserHandle var4 = var3.getCreatorUserHandle();
   }
}
