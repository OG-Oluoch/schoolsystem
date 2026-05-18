package com.backend.schoolsystem.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {

    // === 400 Bad Request ===
    VALIDATION_ERROR("ERR_400_001", "Validation failed", HttpStatus.BAD_REQUEST),
    INVALID_DATE_RANGE("ERR_400_002", "End date must be after start date", HttpStatus.BAD_REQUEST),
    INVALID_MARKS("ERR_400_003", "Marks obtained cannot exceed total marks", HttpStatus.BAD_REQUEST),
    INVALID_STATUS_TRANSITION("ERR_400_004", "Invalid status transition", HttpStatus.BAD_REQUEST),
    INVALID_TERM_NUMBER("ERR_400_005", "Term number must be between 1 and 3", HttpStatus.BAD_REQUEST),
    INVALID_PASS_MARKS("ERR_400_006", "Pass marks cannot exceed total marks", HttpStatus.BAD_REQUEST),
    INVALID_ENROLLMENT("ERR_400_007", "Student enrollment is not active", HttpStatus.BAD_REQUEST),
    STUDENT_NOT_IN_CLASS("ERR_400_008", "Student is not enrolled in this class section", HttpStatus.BAD_REQUEST),

    // === 401 Unauthorized ===
    UNAUTHORIZED("ERR_401_001", "Authentication required", HttpStatus.UNAUTHORIZED),
    INVALID_CREDENTIALS("ERR_401_002", "Invalid username or password", HttpStatus.UNAUTHORIZED),
    TOKEN_EXPIRED("ERR_401_003", "Access token has expired", HttpStatus.UNAUTHORIZED),
    REFRESH_TOKEN_EXPIRED("ERR_401_004", "Refresh token has expired. Please log in again", HttpStatus.UNAUTHORIZED),
    INVALID_TOKEN("ERR_401_005", "Token is invalid or malformed", HttpStatus.UNAUTHORIZED),

    // === 403 Forbidden ===
    FORBIDDEN("ERR_403_001", "You do not have permission to perform this action", HttpStatus.FORBIDDEN),
    ROLE_INSUFFICIENT("ERR_403_002", "Your role does not permit this operation", HttpStatus.FORBIDDEN),
    INACTIVE_ACCOUNT("ERR_403_003", "Your account is inactive. Contact an administrator", HttpStatus.FORBIDDEN),
    CANNOT_MODIFY_OWN_ROLE("ERR_403_004", "You cannot modify your own role", HttpStatus.FORBIDDEN),

    // === 404 Not Found ===
    USER_NOT_FOUND("ERR_404_001", "User not found", HttpStatus.NOT_FOUND),
    STUDENT_NOT_FOUND("ERR_404_002", "Student not found", HttpStatus.NOT_FOUND),
    TEACHER_NOT_FOUND("ERR_404_003", "Teacher not found", HttpStatus.NOT_FOUND),
    PARENT_NOT_FOUND("ERR_404_004", "Parent not found", HttpStatus.NOT_FOUND),
    SUBJECT_NOT_FOUND("ERR_404_005", "Subject not found", HttpStatus.NOT_FOUND),
    GRADE_LEVEL_NOT_FOUND("ERR_404_006", "Grade level not found", HttpStatus.NOT_FOUND),
    CLASS_SECTION_NOT_FOUND("ERR_404_007", "Class section not found", HttpStatus.NOT_FOUND),
    ACADEMIC_YEAR_NOT_FOUND("ERR_404_008", "Academic year not found", HttpStatus.NOT_FOUND),
    TERM_NOT_FOUND("ERR_404_009", "Term not found", HttpStatus.NOT_FOUND),
    ENROLLMENT_NOT_FOUND("ERR_404_010", "Enrollment not found", HttpStatus.NOT_FOUND),
    EXAM_NOT_FOUND("ERR_404_011", "Exam not found", HttpStatus.NOT_FOUND),
    EXAM_RESULT_NOT_FOUND("ERR_404_012", "Exam result not found", HttpStatus.NOT_FOUND),
    TIMETABLE_NOT_FOUND("ERR_404_013", "Timetable entry not found", HttpStatus.NOT_FOUND),
    GROUP_NOT_FOUND("ERR_404_014", "Group not found", HttpStatus.NOT_FOUND),
    CALENDAR_EVENT_NOT_FOUND("ERR_404_015", "Calendar event not found", HttpStatus.NOT_FOUND),
    NO_CURRENT_ACADEMIC_YEAR("ERR_404_016", "No current academic year is set", HttpStatus.NOT_FOUND),
    NO_CURRENT_TERM("ERR_404_017", "No current term is set", HttpStatus.NOT_FOUND),

    // === 409 Conflict ===
    USERNAME_TAKEN("ERR_409_001", "Username is already taken", HttpStatus.CONFLICT),
    EMAIL_TAKEN("ERR_409_002", "Email is already registered", HttpStatus.CONFLICT),
    ADMISSION_NUMBER_EXISTS("ERR_409_003", "Admission number already exists", HttpStatus.CONFLICT),
    NEMIS_NUMBER_EXISTS("ERR_409_004", "NEMIS number already exists", HttpStatus.CONFLICT),
    STUDENT_ALREADY_ENROLLED("ERR_409_005", "Student is already enrolled for this academic year", HttpStatus.CONFLICT),
    RESULT_ALREADY_RECORDED("ERR_409_006", "Result already recorded for this student and exam", HttpStatus.CONFLICT),
    STUDENT_ALREADY_IN_GROUP("ERR_409_007", "Student is already a member of this group", HttpStatus.CONFLICT),
    TEACHER_SUBJECT_EXISTS("ERR_409_008", "Teacher is already assigned to this subject", HttpStatus.CONFLICT),
    TIMETABLE_SLOT_CONFLICT("ERR_409_009", "A timetable conflict exists for this time slot", HttpStatus.CONFLICT),
    NATIONAL_ID_EXISTS("ERR_409_010", "National ID is already registered", HttpStatus.CONFLICT),

    // === 422 Unprocessable ===
    GROUP_CAPACITY_EXCEEDED("ERR_422_001", "Group has reached its maximum member capacity", HttpStatus.UNPROCESSABLE_ENTITY),
    EXAM_DATE_IN_PAST("ERR_422_002", "Exam date cannot be set in the past", HttpStatus.UNPROCESSABLE_ENTITY),
    ACADEMIC_YEAR_OVERLAP("ERR_422_003", "Academic year dates overlap with an existing year", HttpStatus.UNPROCESSABLE_ENTITY),
    TERM_OUTSIDE_ACADEMIC_YEAR("ERR_422_004", "Term dates must fall within the academic year", HttpStatus.UNPROCESSABLE_ENTITY),
    CANNOT_ENROLL_INACTIVE_STUDENT("ERR_422_005", "Cannot enroll an inactive student", HttpStatus.UNPROCESSABLE_ENTITY),

    // === 500 Internal ===
    INTERNAL_ERROR("ERR_500_001", "An unexpected internal error occurred", HttpStatus.INTERNAL_SERVER_ERROR),
    FILE_PROCESSING_ERROR("ERR_500_002", "Failed to process the file", HttpStatus.INTERNAL_SERVER_ERROR);

    private final String code;
    private final String defaultMessage;
    private final HttpStatus httpStatus;

    ErrorCode(String code, String defaultMessage, HttpStatus httpStatus) {
        this.code = code;
        this.defaultMessage = defaultMessage;
        this.httpStatus = httpStatus;
    }
}
