import android.app.Activity;
import android.view.DragEvent;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_668066750AF2CB32A3E91408AC580B1B4ACB5CB319871AACC06E096384D58D06__350909092 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = new ActivityTestRule(Activity.class);
      Activity var3 = var2.getActivity();
      Object var1 = EasyMock.createMock(DragEvent.class);
      var3.requestDragAndDropPermissions((DragEvent)var1);
   }
}
