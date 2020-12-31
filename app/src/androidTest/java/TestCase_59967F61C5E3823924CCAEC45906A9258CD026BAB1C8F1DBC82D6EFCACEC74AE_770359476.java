import android.content.Intent;
import android.os.Bundle;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59967F61C5E3823924CCAEC45906A9258CD026BAB1C8F1DBC82D6EFCACEC74AE_770359476 {
   @Test
   public void testCase() throws Exception {
      Intent var2 = new Intent();
      Object var1 = EasyMock.createMock(Bundle.class);
      var2.replaceExtras((Bundle)var1);
   }
}
