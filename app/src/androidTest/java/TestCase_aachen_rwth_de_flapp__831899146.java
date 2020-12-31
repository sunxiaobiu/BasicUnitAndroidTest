import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import androidx.test.runner.AndroidJUnit4;
import java.util.ArrayList;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aachen_rwth_de_flapp__831899146 {
   @Test
   public void testCase() throws Exception {
      Message var2 = Message.obtain((Handler)null, 7);
      Bundle var3 = var2.getData();
      Object var1 = null;
      var3.putParcelableArrayList("rangingResult", (ArrayList)var1);
   }
}
