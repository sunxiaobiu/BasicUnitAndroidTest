import android.os.Bundle;
import android.os.Message;
import androidx.test.runner.AndroidJUnit4;
import java.util.ArrayList;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aachen_rwth_de_flapp_1358698928 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Message.class);
      Bundle var2 = ((Message)var1).getData();
      ArrayList var3 = var2.getParcelableArrayList("rangingResult");
   }
}
