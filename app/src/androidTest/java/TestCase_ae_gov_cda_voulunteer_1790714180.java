import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.RemoteInput;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_cda_voulunteer_1790714180 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Intent.class);
      Bundle var1 = RemoteInput.getResultsFromIntent((Intent)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
