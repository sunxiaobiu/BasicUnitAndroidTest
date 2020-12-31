import android.content.Intent;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyService;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abc_kids_preschool_learning_phonics_songs_videos__1174141025 {
   @Test
   public void testCase() throws Exception {
      MyService var2 = new MyService();
      Object var1 = EasyMock.createMock(Intent.class);
      var2.onTaskRemoved((Intent)var1);
   }
}
