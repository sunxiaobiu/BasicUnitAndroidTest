import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_arproductions_andrew_expenselog_784152424 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Activity.class);
      Object var1 = EasyMock.createMock(Intent.class);
      ActivityCompat.startActivityForResult((Activity)var0, (Intent)var1, 2343243, (Bundle)null);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
