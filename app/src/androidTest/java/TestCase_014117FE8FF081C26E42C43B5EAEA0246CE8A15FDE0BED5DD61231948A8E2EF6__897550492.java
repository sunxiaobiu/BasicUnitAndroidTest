import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_014117FE8FF081C26E42C43B5EAEA0246CE8A15FDE0BED5DD61231948A8E2EF6__897550492 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Intent.class);
      Bundle var1 = RemoteInput.getResultsFromIntent((Intent)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
