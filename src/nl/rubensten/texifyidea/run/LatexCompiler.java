package nl.rubensten.texifyidea.run;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.ProjectRootManager;
import com.intellij.openapi.vfs.VirtualFile;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sten Wessel
 */
public enum LatexCompiler {
    PDFLATEX("pdfLaTeX");

    private String displayName;


    LatexCompiler(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return this.displayName;
    }

    public List<String> getCommand(LatexRunConfiguration runConfig, Project project) {
        List<String> command = new ArrayList<>();
        VirtualFile moduleRoot = ProjectRootManager.getInstance(project).getFileIndex().getContentRootForFile(runConfig.getMainFile());

        if (this == PDFLATEX) {
            command.add("pdflatex");
            command.add("-file-line-error");
            command.add("-time-statistics");
            command.add("-c-style-errors");
            command.add("-max-print-line=10000");
            command.add("-interaction=nonstopmode");
            command.add("-output-directory=" + moduleRoot.getPath() + "/out");

            if (runConfig.hasAuxDir()) {
                command.add("-aux-directory=" + moduleRoot.getPath() + "/auxil");
            }
        }

        command.add(runConfig.getMainFile().getPath());

        return command;
    }
}