import android.os.Bundle;
import android.support.v4.app.RemoteInput.Builder;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5B1F3289EC0F44CE208F5C40CAEF7231DBAAB6AFA611A026334E4AB0DF9CFEA6__1528937699 {
   @Test
   public void testCase() throws Exception {
      Bundle var2 = new Bundle();
      String var1 = var2.getString("resultKey");
      Builder var3 = new Builder(var1);
      boolean var4 = true;
      var3.setAllowFreeFormInput(var4);
   }
}
