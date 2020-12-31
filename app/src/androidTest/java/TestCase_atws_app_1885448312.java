import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_atws_app_1885448312 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(DialogInterface.class);
      AlertDialog var2 = (AlertDialog)var1;
      Activity var3 = var2.getOwnerActivity();
   }
}
