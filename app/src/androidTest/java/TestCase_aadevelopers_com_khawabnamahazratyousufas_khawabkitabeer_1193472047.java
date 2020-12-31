import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aadevelopers_com_khawabnamahazratyousufas_khawabkitabeer_1193472047 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      Object var1 = null;
      ProgressDialog.show((Context)var0, (CharSequence)null, "Loading....", false, false, (OnCancelListener)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
